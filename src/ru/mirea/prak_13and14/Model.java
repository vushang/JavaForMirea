package ru.mirea.prak_13and14;

import java.util.ArrayList;

public class Model {
    public int cheсkPlay(ArrayList<Integer> list) {
        // Проверка для игрока с крестиком
        int t = 0;
        // проверка горизонтального выйграша у крестика
        for (int i = 1; i <= 4; ++i) {
            if(list.get(t) == 1 && list.get(t + 1) == 1 && list.get(t + 2) == 1 && list.get(t + 3) == 1)
                return 1;
            t+=4;
        }
        // проверка вертикального выйграша у крестика
        for (int i = 0; i < 4; ++i){
            if(list.get(i) == 1 && list.get(i + 4) == 1 && list.get(i + 8) == 1 && list.get(i + 12) == 1)
                return 1;
        }
        // проверка левого диагонального выйигрыша у крестика
        if(list.get(0) == 1 && list.get(5) == 1 && list.get(10) == 1 && list.get(15) == 1)
            return 1;
            // проверка правого диагонального выйигрыша у крестика
        else if(list.get(3) == 1 && list.get(6) == 1 && list.get(9) == 1 && list.get(12) == 1)
            return 1;

        // проверка для игрока с кругом
        t = 0;
        // проверка горизонтального выйграша у круга
        for (int i = 1; i <= 4; ++i) {
            if(list.get(t) == 2 && list.get(t + 1) == 2 && list.get(t + 2) == 2 && list.get(t + 3) == 2)
                return -1;
            t+=4;
        }
        // проверка вертикального выйграша у круга
        for (int i = 0; i < 4; ++i){
            if(list.get(i) == 2 && list.get(i + 4) == 2 && list.get(i + 8) == 2 && list.get(i + 12) == 2)
                return -1;
        }
        // проверка левого диагонального выйигрыша у круга
        if(list.get(0) == 2 && list.get(5) == 2 && list.get(10) == 2 && list.get(15) == 2)
            return -1;
            // проверка правого диагонального выйигрыша у круга
        else if(list.get(3) == 2 && list.get(6) == 2 && list.get(9) ==2 && list.get(12) == 2)
            return -1;

        // Проверка нечьи
        boolean n= false;
        for(int i =0; i < 16;++i)
            if(list.get(i) == 0)
                n = true;
        if(!n)
            return 0;

        return -2; // неопределенность
    }
}
