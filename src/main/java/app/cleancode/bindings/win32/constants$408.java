// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$408 {

    static final FunctionDescriptor GetWindowTextW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetWindowTextW$MH = RuntimeHelper.downcallHandle(
        "GetWindowTextW",
        constants$408.GetWindowTextW$FUNC
    );
    static final FunctionDescriptor GetWindowTextLengthA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindowTextLengthA$MH = RuntimeHelper.downcallHandle(
        "GetWindowTextLengthA",
        constants$408.GetWindowTextLengthA$FUNC
    );
    static final FunctionDescriptor GetWindowTextLengthW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindowTextLengthW$MH = RuntimeHelper.downcallHandle(
        "GetWindowTextLengthW",
        constants$408.GetWindowTextLengthW$FUNC
    );
    static final FunctionDescriptor GetClientRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClientRect$MH = RuntimeHelper.downcallHandle(
        "GetClientRect",
        constants$408.GetClientRect$FUNC
    );
    static final FunctionDescriptor GetWindowRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindowRect$MH = RuntimeHelper.downcallHandle(
        "GetWindowRect",
        constants$408.GetWindowRect$FUNC
    );
    static final FunctionDescriptor AdjustWindowRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle AdjustWindowRect$MH = RuntimeHelper.downcallHandle(
        "AdjustWindowRect",
        constants$408.AdjustWindowRect$FUNC
    );
}


