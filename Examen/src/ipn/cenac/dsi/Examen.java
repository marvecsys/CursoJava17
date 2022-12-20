/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipn.cenac.dsi;

/**
 *
 * @author Desarrollo 01
 */
public class Examen {
    public static void main (String args[]) {
        int[] Array = {6,9,8};
        System.out.println("B" + Array.binarySearch(Array,9));
        System.out.println("B" + Array.comparre (Array, new int[] {6,9,8}));
        System.out.println("M" + Array.mismatch(Array, new int[6,9,8]));
    }
}