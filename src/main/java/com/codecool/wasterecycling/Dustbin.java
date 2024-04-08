package com.codecool.wasterecycling;

import java.util.Arrays;
import java.util.ArrayList;

public class Dustbin {
        private String color;
        private Garbage[] garbageArr = new Garbage[0];

        public Dustbin(String color) {
                this.color = color;
        }

        public String getColor() {
                return color;
        }

        public void throwOutGarbage(Garbage garbage) throws DustbinContentException {
                if (garbage instanceof PlasticGarbage && !((PlasticGarbage) garbage).isCleaned()) {
                        throw new DustbinContentException();
                } else if (garbage instanceof PaperGarbage && !((PaperGarbage) garbage).isSqueezed()) {
                        throw new DustbinContentException();
                }

                garbageArr = Arrays.copyOf(garbageArr, garbageArr.length + 1);
                garbageArr[garbageArr.length - 1] = garbage;
        }

        public int getHouseWasteCount() {
                int count = 0;
                for (Garbage garbage : garbageArr) {
                        if (!(garbage instanceof PlasticGarbage) && !(garbage instanceof PaperGarbage)) {
                                count++;
                        }
                }
                return count;
        }

        public int getPaperCount() {
                int count = 0;
                for (Garbage garbage : garbageArr) {
                        if (garbage instanceof PaperGarbage) {
                                count++;
                        }
                }
                return count;
        }

        public int getPlasticCount() {
                int count = 0;
                for (Garbage garbage : garbageArr) {
                        if (garbage instanceof PlasticGarbage) {
                                count++;
                        }
                }
                return count;
        }

        public void emptyContents() {
                garbageArr = new Garbage[0];
        }

        public void printContents() {
                System.out.println("Dustbin color: " + getColor());
                for (Garbage garbage : garbageArr) {
                        String type = "Garbage";
                        if (garbage instanceof PlasticGarbage) {
                                type = "Plastic Garbage";
                        } else if (garbage instanceof PaperGarbage) {
                                type = "Paper Garbage";
                        }
                        System.out.printf("%s: %s\n", type, garbage.getName());
                }
        }

        @Override
        public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(String.format("%s Dustbin!\n", color));

                ArrayList<String> houseWasteItems = new ArrayList<>();
                ArrayList<String> paperItems = new ArrayList<>();
                ArrayList<String> plasticItems = new ArrayList<>();

                for (Garbage garbage : garbageArr) {
                        if (garbage instanceof PaperGarbage) {
                                paperItems.add(garbage.getName());
                        } else if (garbage instanceof PlasticGarbage) {
                                plasticItems.add(garbage.getName());
                        } else {
                                houseWasteItems.add(garbage.getName());
                        }
                }

                int houseWasteCount = getHouseWasteCount();
                int paperCount = getPaperCount();
                int plasticCount = getPlasticCount();

                sb.append(String.format("House waste content: %d item(s)\n", houseWasteCount));
                for (int i = 0; i < houseWasteCount; i++) {
                        sb.append(String.format("%s nr.%d\n", houseWasteItems.get(i), i + 1));
                }

                sb.append(String.format("Paper content: %d item(s)\n", paperCount));
                for (int i = 0; i < paperCount; i++) {
                        sb.append(String.format("%s nr.%d\n", paperItems.get(i), i + 1));
                }

                sb.append(String.format("Plastic content: %d item(s)\n", plasticCount));
                for (int i = 0; i < plasticCount; i++) {
                        sb.append(String.format("%s nr.%d\n", plasticItems.get(i), i + 1));
                }

                return sb.toString();
        }

        public void displayContents() {
                System.out.println(this);
        }

}
