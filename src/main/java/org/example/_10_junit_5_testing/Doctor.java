package org.example._10_junit_5_testing;

public enum Doctor {
    avery("Ralph Avery"),
    johnson("Beth Johnson"),
    murphy("Pat Murphy");

    private String name;

    Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
