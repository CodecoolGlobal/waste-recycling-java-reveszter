package com.codecool.wasterecycling;

public class PaperGarbage extends Garbage {
        private boolean squeezed;

        public PaperGarbage(String name, boolean squeezed) {
                super(name);
                this.squeezed = squeezed;
        }

        public boolean isSqueezed() {
                return squeezed;
        }

        public void squeeze() {
                squeezed = true;
        }
}
