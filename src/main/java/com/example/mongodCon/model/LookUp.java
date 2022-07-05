package com.example.mongodCon.model;

import java.util.List;

public class LookUp {
    LookUpData $lookup ;

    public LookUp(LookUpData $lookup) {
        this.$lookup = $lookup;
    }

    public LookUpData get$lookup() {
        return $lookup;
    }

    public void set$lookup(LookUpData $lookup) {
        this.$lookup = $lookup;
    }
}
