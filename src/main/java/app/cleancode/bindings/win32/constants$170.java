// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$170 {

    static final FunctionDescriptor EnumFontsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumFontsA$MH = RuntimeHelper.downcallHandle(
        "EnumFontsA",
        constants$170.EnumFontsA$FUNC
    );
    static final FunctionDescriptor EnumFontsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumFontsW$MH = RuntimeHelper.downcallHandle(
        "EnumFontsW",
        constants$170.EnumFontsW$FUNC
    );
    static final FunctionDescriptor EnumObjects$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumObjects$MH = RuntimeHelper.downcallHandle(
        "EnumObjects",
        constants$170.EnumObjects$FUNC
    );
    static final FunctionDescriptor EqualRgn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EqualRgn$MH = RuntimeHelper.downcallHandle(
        "EqualRgn",
        constants$170.EqualRgn$FUNC
    );
    static final FunctionDescriptor Escape$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Escape$MH = RuntimeHelper.downcallHandle(
        "Escape",
        constants$170.Escape$FUNC
    );
    static final FunctionDescriptor ExtEscape$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ExtEscape$MH = RuntimeHelper.downcallHandle(
        "ExtEscape",
        constants$170.ExtEscape$FUNC
    );
}


