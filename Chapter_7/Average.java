class Average
{
    public static void main(String[] args)
    {
        int[] responseTimes = {100, 200, 150, 300};
        System.out.println(countGreaterThanPreviousAverage(responseTimes));
    }

    public static int countGreaterThanPreviousAverage(int[] arr)
    {
        int count = 0;
        double sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (i > 0)
            {
                double average = sum / i;   

                if (arr[i] > average)       
                {
                    count++;
                }
            }

            sum += arr[i];                  
        }

        return count;
    }
}
