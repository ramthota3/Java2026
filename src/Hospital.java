
    class Hospital {

        public void service() {
            System.out.println("Hospital provides medical services");
        }
    }

    class Doctor extends Hospital {

        public void duty() {
            System.out.println("Doctor treats patients");
        }
    }

    class Nurse extends Hospital {

        public void duty() {
            System.out.println("Nurse takes care of patients");
        }
    }

    class Pharmacist extends Hospital {

        public void duty() {
            System.out.println("Pharmacist gives medicines");
        }
    }

    class HospitalDemo {

        public static void main(String[] args) {

            Doctor d = new Doctor();
            Nurse n = new Nurse();
            Pharmacist p = new Pharmacist();

            d.service();
            d.duty();

            n.service();
            n.duty();

            p.service();
            p.duty();
        }
    }

