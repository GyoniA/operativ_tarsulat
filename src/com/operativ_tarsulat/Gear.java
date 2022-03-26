package com.operativ_tarsulat;

import java.io.Serializable;

public abstract class Gear implements Effect, Serializable {
    public abstract GearSlot GetSlot();
}
