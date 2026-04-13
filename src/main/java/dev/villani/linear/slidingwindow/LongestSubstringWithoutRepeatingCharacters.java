package dev.villani.linear.slidingwindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;

        int slow = 0;
        int longestWindow = 0;

        Map<Character, Integer> windowChar = new HashMap<>();

        for (int fast = 0; fast < s.length(); fast++) {
            char c1 = s.charAt(fast);

            //se tem duplicata diminuir a janela a esquerda (slow) e remover da janela
            if (windowChar.containsKey(c1)) {
                //acha a nova posição do ponteiro até não haver duplicidade
                //slow = Math.max(slow,(windowChar.get(c1) + 1));
                if (slow < (windowChar.get(c1) + 1)) {
                    slow = windowChar.get(c1) + 1;
                }
            }

            windowChar.put(c1, fast);
            //longestWindow = Math.max(longestWindow, (fast - slow + 1));
            if (longestWindow < (fast - slow + 1)) {
                longestWindow = fast - slow + 1;
            }
        }
        return longestWindow;
    }

    public static int lengthOfLongestSubstring2(String s) {
        //versão otimizada para não usar hashmap e ser mais rápida
        if (s == null || s.isEmpty()) return 0;

        int slow = 0;
        int longestWindow = 0;
        int[] index = new int[128]; // posição de cada char ASCII
        Arrays.fill(index, -1);     // -1 = nunca visto

        for (int fast = 0; fast < s.length(); fast++) {
            char c1 = s.charAt(fast);

            // se já foi visto E está dentro da janela atual
            if (index[c1] >= slow) {
                slow = index[c1] + 1; // teleporta o slow
            }

            index[c1] = fast; // atualiza a posição do char

            if (longestWindow < (fast - slow + 1)) {
                longestWindow = fast - slow + 1;
            }
        }

        return longestWindow;
    }

    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("abcabcbb");
        //Output: 3 , The answer is "abc"
        System.out.println("Result: "+ result);
        /*
            fast→ a b c a b c
            slow→ |___|       valid, expande
                  |_____|     'a' repetiu! contrai até remover o 'a'
                    |___|     atualiza o slow e continua
        */

        int result2 = lengthOfLongestSubstring("bbbbb");
        //Output: 1, The answer is "b"
        System.out.println("Result2: "+ result2);

        int result3 = lengthOfLongestSubstring("pwwkew");
        //Output: 3, The answer is "wke"
        System.out.println("Result3: "+ result3);
    }
}
