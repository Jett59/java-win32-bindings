// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$327 {

    static final FunctionDescriptor LoadImageW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LoadImageW$MH = RuntimeHelper.downcallHandle(
        "LoadImageW",
        constants$327.LoadImageW$FUNC
    );
    static final FunctionDescriptor CopyImage$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CopyImage$MH = RuntimeHelper.downcallHandle(
        "CopyImage",
        constants$327.CopyImage$FUNC
    );
    static final FunctionDescriptor DrawIconEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DrawIconEx$MH = RuntimeHelper.downcallHandle(
        "DrawIconEx",
        constants$327.DrawIconEx$FUNC
    );
    static final FunctionDescriptor CreateIconIndirect$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateIconIndirect$MH = RuntimeHelper.downcallHandle(
        "CreateIconIndirect",
        constants$327.CreateIconIndirect$FUNC
    );
    static final FunctionDescriptor CopyIcon$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CopyIcon$MH = RuntimeHelper.downcallHandle(
        "CopyIcon",
        constants$327.CopyIcon$FUNC
    );
    static final FunctionDescriptor GetIconInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetIconInfo$MH = RuntimeHelper.downcallHandle(
        "GetIconInfo",
        constants$327.GetIconInfo$FUNC
    );
}


