public class ExceptionMaker {
    public int[] massSum(int[] a, int[]b) throws IndexOutOfBoundsException,NullPointerException {
        int[] result=null;
        try {
            result=new int[a.length];
            for (int i=0;i<a.length;i++){
                result[i]=a[i]+b[i];
            }
            return result;
        } catch (IndexOutOfBoundsException e){
            System.out.println("Arrays have different lengths");
            return null;
        } catch (NullPointerException e){
            System.out.println("Arrays have different lengths");
            return null;
        }

    }
}
