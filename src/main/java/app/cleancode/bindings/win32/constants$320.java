// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$320 {

    static final FunctionDescriptor CheckColorsInGamut$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CheckColorsInGamut$MH = RuntimeHelper.downcallHandle(
        "CheckColorsInGamut",
        constants$320.CheckColorsInGamut$FUNC
    );
    static final FunctionDescriptor GetColorSpace$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetColorSpace$MH = RuntimeHelper.downcallHandle(
        "GetColorSpace",
        constants$320.GetColorSpace$FUNC
    );
    static final FunctionDescriptor GetLogColorSpaceA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetLogColorSpaceA$MH = RuntimeHelper.downcallHandle(
        "GetLogColorSpaceA",
        constants$320.GetLogColorSpaceA$FUNC
    );
    static final FunctionDescriptor GetLogColorSpaceW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetLogColorSpaceW$MH = RuntimeHelper.downcallHandle(
        "GetLogColorSpaceW",
        constants$320.GetLogColorSpaceW$FUNC
    );
    static final FunctionDescriptor CreateColorSpaceA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateColorSpaceA$MH = RuntimeHelper.downcallHandle(
        "CreateColorSpaceA",
        constants$320.CreateColorSpaceA$FUNC
    );
    static final FunctionDescriptor CreateColorSpaceW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateColorSpaceW$MH = RuntimeHelper.downcallHandle(
        "CreateColorSpaceW",
        constants$320.CreateColorSpaceW$FUNC
    );
}


