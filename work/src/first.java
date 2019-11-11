public class first {
    public static void main(String[] args) {
        public static void main(String[] args) {

            String [] arr = {"a","foo","bar","foo","bla"};
            String t = "foo";
            System.out.println(countAppearance(arr,t));

        }
        public int  count_appearance(String[] arr,String t)
        {

            int count=0;
            for (String arr1 : arr) {
                if (t.equals(arr1)) {
                    count++;
                }
            }
            return count;
        }
    }
}
