public class WorldBank {
        public void rateOfInterest() {
            System.out.println("Bank gives interest");
        }
    }

    class Sbi extends WorldBank {
        @Override
        public void rateOfInterest() {
            System.out.println("Sbi gives 7% interest");
        }
    }

    class Bob extends WorldBank {
        @Override
        public void rateOfInterest() {
            System.out.println("Bob gives 8% interest");
        }
    }

    class Fi extends WorldBank {
        @Override
        public void rateOfInterest() {
            System.out.println("Fi gives 6% interest");
        }
    }

     class WorldBankDemo {
        public static void main(String[] args) {

            WorldBank b = null;
            String bankName = "Bob";

            if (bankName.equals("Sbi")) {
                b = new Sbi();
            }
            else if (bankName.equals("Bob")) {
                b = new Bob();
            }
            else if (bankName.equals("Fi")) {
                b = new Fi();
            }

            b.rateOfInterest();
        }
    }

