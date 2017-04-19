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
public class MergeSort
{
   /**
    * DOCUMENT ME!
    *
    * @param args DOCUMENT ME!
    */
   public static void main(String[] args)
   {
      int[] a = {4, 2, 3, 1};
      mergeSort(a);
      System.out.println();
   }

   private static void mergeSort(int[] a)
   {
      int n = a.length;

      if (n < 2)
      {
         return;
      }

      int mid = n / 2;
      int[] left = new int[mid];
      int[] right = new int[n - mid];

      for (int i = 0; i <= mid - 1; i++)
      {
         left[i] = a[i];
      }

      for (int i = mid; i <= n - 1; i++)
      {
         right[i - mid] = a[i];
      }

      mergeSort(left);
      mergeSort(right);
      mergeSort(left, right, a);
   }

   private static void mergeSort(int[] left, int[] right, int[] a)
   {
      int k = 0, i = 0, j = 0;

      while (i < left.length && j < right.length)
      {
         if (left[i] <= right[j])
         {
            a[k] = left[i];
            i++;
            k++;
         }
         else
         {
            a[k] = right[j];
            j++;
            k++;
         }
      }

      while (i < left.length)
      {
         a[k] = left[i];
         i++;
         k++;
      }

      while (j < right.length)
      {
         a[k] = right[j];
         j++;
         k++;
      }
   }
}