package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static final Map<String, String> HM = new HashMap<String, String>() {{
        put("Москаленко", "Сергей");
        put("Швагер", "Виталий");
        put("Бурковский", "Сергей");
        put("Кудактина", "Ирина");
        put("Сорокауст", "Виталий");
        put("Бурковская", "Татьяна");
        put("Зигангеров", "Сергей");
    }};

    public static void main(String[] args) {
        HashMap<String, String> hmCopy = new HashMap<>();
        List<String> keysForDelete = new ArrayList<>();

        for (HashMap.Entry<String, String> hm : HM.entrySet()) {
            if (hmCopy.put( hm.getValue(), hm.getKey()) != null) // перевіряємо, чи була заміна старого аналогічного ключа (ім'я) на такеж саме
               keysForDelete.add(hm.getValue()); // додаємо позиції для видалення
        }

        //ВСЕ, наразі маємо hmCopy без жодного повторення ім'я, при цьому маємо перелік імен для видалення
        for (String keyForDelete:keysForDelete) {
             hmCopy.remove(keyForDelete);
        }

        System.out.println("Unique names List");
        for (HashMap.Entry<String, String> hm : hmCopy.entrySet()) {
            System.out.println("- " + hm.getValue() + " " + hm.getKey());
        }
}
}


