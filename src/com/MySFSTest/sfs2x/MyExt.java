package com.MySFSTest.sfs2x;

import com.smartfoxserver.v2.extensions.SFSExtension;

public class MyExt extends SFSExtension {
    @Override
    public void init() {

        this.addRequestHandler("math", MathHandler.class);
    }
}
