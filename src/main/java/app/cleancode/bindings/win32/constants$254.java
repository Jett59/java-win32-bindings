// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$254 {

    static final FunctionDescriptor MoveWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MoveWindow$MH = RuntimeHelper.downcallHandle(
        "MoveWindow",
        constants$254.MoveWindow$FUNC
    );
    static final FunctionDescriptor SetWindowPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetWindowPos$MH = RuntimeHelper.downcallHandle(
        "SetWindowPos",
        constants$254.SetWindowPos$FUNC
    );
    static final FunctionDescriptor GetWindowPlacement$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindowPlacement$MH = RuntimeHelper.downcallHandle(
        "GetWindowPlacement",
        constants$254.GetWindowPlacement$FUNC
    );
    static final FunctionDescriptor SetWindowPlacement$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetWindowPlacement$MH = RuntimeHelper.downcallHandle(
        "SetWindowPlacement",
        constants$254.SetWindowPlacement$FUNC
    );
    static final FunctionDescriptor GetWindowDisplayAffinity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindowDisplayAffinity$MH = RuntimeHelper.downcallHandle(
        "GetWindowDisplayAffinity",
        constants$254.GetWindowDisplayAffinity$FUNC
    );
    static final FunctionDescriptor SetWindowDisplayAffinity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetWindowDisplayAffinity$MH = RuntimeHelper.downcallHandle(
        "SetWindowDisplayAffinity",
        constants$254.SetWindowDisplayAffinity$FUNC
    );
}

