package com.codecool.wasterecycling;

public class Main {

        public static void main(String[] args) {
                Dustbin greenDustbin = new Dustbin("Green");

                Garbage applePeel = new Garbage("Apple Peel");
                Garbage plasticBottle = new PlasticGarbage("Plastic Bottle", false);
                Garbage squeezedPaper = new PaperGarbage("Squeezed Newspaper", true);
                Garbage milkCarton = new PaperGarbage("Milk Carton", false);

                try {
                        greenDustbin.throwOutGarbage(applePeel);
                        greenDustbin.throwOutGarbage(plasticBottle);
                        greenDustbin.throwOutGarbage(squeezedPaper);
                        greenDustbin.throwOutGarbage(milkCarton);
                } catch (DustbinContentException e) {
                        System.out.println("Error throwing garbage into the bin: " + e.getMessage());
                }

                PlasticGarbage dirtyPlasticBag = new PlasticGarbage("Dirty Plastic Bag", false);
                try {
                        greenDustbin.throwOutGarbage(dirtyPlasticBag);
                } catch (DustbinContentException e) {
                        System.out.println("The dirty plastic bag can't be thrown out: " + e.getMessage());
                        dirtyPlasticBag.clean();
                        try {
                                greenDustbin.throwOutGarbage(dirtyPlasticBag);
                        } catch (DustbinContentException ex) {
                                System.out.println("Error throwing cleaned plastic into the bin: " + ex.getMessage());
                        }
                }

                ((PaperGarbage)milkCarton).squeeze();
                try {
                        greenDustbin.throwOutGarbage(milkCarton);
                } catch (DustbinContentException ex) {
                        System.out.println("Failed to throw the squeezed milk carton, which shouldn't happen.");
                }

                System.out.println("Before emptying the bin:");
                System.out.println(greenDustbin);

                greenDustbin.emptyContents();
                System.out.println("After emptying the bin:");
                System.out.println(greenDustbin);
        }
}
