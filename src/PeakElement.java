// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class PeakElement {
   public PeakElement() {
   }

   public static int peakElement(int[] var0) {
      int var1 = var0.length;
      if (var1 == 0) {
         return -1;
      } else if (var1 != 1 && var0[0] <= var0[1]) {
         for(int var2 = 1; var2 < var1 - 1; ++var2) {
            if (var0[var2] > var0[var2 + 1] && var0[var2] > var0[var2 - 1]) {
               return var2;
            }
         }

         if (var0[var1 - 1] > var0[var1 - 2]) {
            return var1 - 1;
         } else {
            return -1;
         }
      } else {
         return 0;
      }
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var1.nextInt();
      }

      System.out.println(peakElement(var3));
   }
}
