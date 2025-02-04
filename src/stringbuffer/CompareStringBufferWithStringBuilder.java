package stringbuffer;

public class CompareStringBufferWithStringBuilder {
    public static void main(String[] args) {
        long startTime, endTime;

        StringBuffer buffer = new StringBuffer();
        StringBuilder builder = new StringBuilder();

        startTime= System.nanoTime();
        for(int i=0;i<1000000;i++){
            buffer.append("hello");
        }
        endTime=System.nanoTime();

        System.out.println("Time taken by StringBuffer is : "+(endTime-startTime)+" nano seconds.");

        startTime= System.nanoTime();
        for(int i=0;i<1000000;i++){
            builder.append("hello");
        }
        endTime=System.nanoTime();

        System.out.println("Time taken by StringBuilder is : "+(endTime-startTime)+" nano seconds.");
    }
}
