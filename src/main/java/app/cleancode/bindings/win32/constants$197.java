// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$197 {

    static final FunctionDescriptor GradientFill$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GradientFill$MH = RuntimeHelper.downcallHandle(
        "GradientFill",
        constants$197.GradientFill$FUNC
    );
    static final FunctionDescriptor GdiAlphaBlend$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_CHAR$LAYOUT.withName("BlendOp"),
            Constants$root.C_CHAR$LAYOUT.withName("BlendFlags"),
            Constants$root.C_CHAR$LAYOUT.withName("SourceConstantAlpha"),
            Constants$root.C_CHAR$LAYOUT.withName("AlphaFormat")
        ).withName("_BLENDFUNCTION")
    );
    static final MethodHandle GdiAlphaBlend$MH = RuntimeHelper.downcallHandle(
        "GdiAlphaBlend",
        constants$197.GdiAlphaBlend$FUNC
    );
    static final FunctionDescriptor GdiTransparentBlt$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GdiTransparentBlt$MH = RuntimeHelper.downcallHandle(
        "GdiTransparentBlt",
        constants$197.GdiTransparentBlt$FUNC
    );
    static final FunctionDescriptor GdiGradientFill$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GdiGradientFill$MH = RuntimeHelper.downcallHandle(
        "GdiGradientFill",
        constants$197.GdiGradientFill$FUNC
    );
    static final FunctionDescriptor PlayMetaFileRecord$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PlayMetaFileRecord$MH = RuntimeHelper.downcallHandle(
        "PlayMetaFileRecord",
        constants$197.PlayMetaFileRecord$FUNC
    );
    static final FunctionDescriptor MFENUMPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
}

