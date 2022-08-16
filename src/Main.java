
    public class Main {

        public static void main(String[] args) {

            try {
                print(null);
            } catch (Exception e) {
                e.printStackTrace();
            }


        }

        public static void print(String test) throws Exception {
            if (test == null) {
                throw new MilosException();
            }
            System.out.println(test);
        }


    }





