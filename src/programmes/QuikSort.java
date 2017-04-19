/**
 * Copyright (c) 2015 CA.  All rights reserved.
 *
 * This software and all information contained therein is confidential and
 * proprietary and shall not be duplicated, used, disclosed or disseminated
 * in any way except as authorized by the applicable license agreement,
 * without the express written permission of CA. All authorized reproductions
 * must be marked with this language.
 *
 * EXCEPT AS SET FORTH IN THE APPLICABLE LICENSE AGREEMENT, TO THE EXTENT
 * PERMITTED BY APPLICABLE LAW, CA PROVIDES THIS SOFTWARE WITHOUT
 * WARRANTY OF ANY KIND, INCLUDING WITHOUT LIMITATION, ANY IMPLIED
 * WARRANTIES OF MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  IN
 * NO EVENT WILL CA BE LIABLE TO THE END USER OR ANY THIRD PARTY FOR ANY
 * LOSS OR DAMAGE, DIRECT OR INDIRECT, FROM THE USE OF THIS SOFTWARE,
 * INCLUDING WITHOUT LIMITATION, LOST PROFITS, BUSINESS INTERRUPTION,
 * GOODWILL, OR LOST DATA, EVEN IF CA IS EXPRESSLY ADVISED OF SUCH LOSS OR
 * DAMAGE.
 */
package programmes;

/**
 * DOCUMENT ME!
 */
public class QuikSort
{
   /**
    * DOCUMENT ME!
    *
    * @param args DOCUMENT ME!
    */
   public static void main(String[] args)
   {
      int[] a = {5, 3, 4, 7};
      quikSort(a, 0, a.length - 1);
   }

   private static void quikSort(int[] a, int start, int end)
   {
      if (start < end)
      {
         int index = partition(a, start, end);
         quikSort(a, start, index - 1);
         quikSort(a, index + 1, end);
      }
   }

   private static int partition(int[] a, int start, int end)
   {
      int pivot = a[end];
      int pIndex = start;

      for (int i = start; i < end; i++)
      {
         if (a[i] <= pivot)
         {
            int temp = a[i];
            a[i] = a[pIndex];
            a[pIndex] = temp;
            pIndex++;
         }
      }

      int temp = a[pIndex];
      a[pIndex] = a[pivot];
      a[pivot] = temp;

      return pIndex;
   }
}