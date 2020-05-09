package Java;
public class Airport {


        public static volatile Runway RUNWAY = new Runway();   //we have only one

        public static void main(String[] args) throws InterruptedException {
            Plane plane1 = new Plane("Plane #1");
            Plane plane2 = new Plane("Plane #2");
            Plane plane3 = new Plane("Plane #3");
        }

        private static void waiting() {
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
            }

        }

        private static void takingOff() {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }

        public static class Plane extends Thread {
            public Plane(String name) {
                super(name);
                start();
            }

            public void run() {
                boolean isAlreadyTakenOff = false;
                while (!isAlreadyTakenOff) {
                    if (RUNWAY.trySetTakingOffPlane(this)) {    //check if runway is empty
                        System.out.println(getName() + " is taking off");
                        takingOff();
                        System.out.println(getName() + " at the sky");
                        isAlreadyTakenOff = true;
                        RUNWAY.setTakingOffPlane(null);
                    } else if (!this.equals(RUNWAY.getTakingOffPlane())) {  //if runway is used by other plain
                        System.out.println(getName() + " is waiting");
                        waiting();
                    }
                }
            }
        }

        public static class Runway {
            private Thread t;

            public Thread getTakingOffPlane() {
                return t;
            }

            public void setTakingOffPlane(Thread t) {
                synchronized (this) {
                    this.t = t;
                }
            }

            public boolean trySetTakingOffPlane(Thread t) {
                synchronized (this) {
                    if (this.t == null) {
                        this.t = t;
                        return true;
                    }
                    return false;
                }
            }
        }
    }



