package com.codecool.wasterecycling;

public class PlasticGarbage extends Garbage {
        private boolean cleaned;

        public PlasticGarbage(String name, boolean cleaned) {
                super(name);
                this.cleaned = cleaned;
        }

        public boolean isCleaned() {
                return cleaned;
        }

        public void clean() {
                cleaned = true;
        }
}
