package com.eldritchmod.data;

import com.eldritchmod.data.MagicUserType.MagicUserTypes;

public interface IMagicUserType {
    
    public void set(MagicUserTypes type);
    
    public MagicUserTypes getType();
}