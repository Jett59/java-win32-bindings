// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$406 {

    static final FunctionDescriptor SetPropW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetPropW$MH = RuntimeHelper.downcallHandle(
        "SetPropW",
        constants$406.SetPropW$FUNC
    );
    static final FunctionDescriptor GetPropA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPropA$MH = RuntimeHelper.downcallHandle(
        "GetPropA",
        constants$406.GetPropA$FUNC
    );
    static final FunctionDescriptor GetPropW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPropW$MH = RuntimeHelper.downcallHandle(
        "GetPropW",
        constants$406.GetPropW$FUNC
    );
    static final FunctionDescriptor RemovePropA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RemovePropA$MH = RuntimeHelper.downcallHandle(
        "RemovePropA",
        constants$406.RemovePropA$FUNC
    );
    static final FunctionDescriptor RemovePropW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RemovePropW$MH = RuntimeHelper.downcallHandle(
        "RemovePropW",
        constants$406.RemovePropW$FUNC
    );
    static final FunctionDescriptor EnumPropsExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumPropsExA$MH = RuntimeHelper.downcallHandle(
        "EnumPropsExA",
        constants$406.EnumPropsExA$FUNC
    );
}


