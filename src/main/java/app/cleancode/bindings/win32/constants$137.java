// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$137 {

    static final FunctionDescriptor GetLargePageMinimum$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle GetLargePageMinimum$MH = RuntimeHelper.downcallHandle(
        "GetLargePageMinimum",
        constants$137.GetLargePageMinimum$FUNC
    );
    static final FunctionDescriptor GetProcessWorkingSetSizeEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessWorkingSetSizeEx$MH = RuntimeHelper.downcallHandle(
        "GetProcessWorkingSetSizeEx",
        constants$137.GetProcessWorkingSetSizeEx$FUNC
    );
    static final FunctionDescriptor SetProcessWorkingSetSizeEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetProcessWorkingSetSizeEx$MH = RuntimeHelper.downcallHandle(
        "SetProcessWorkingSetSizeEx",
        constants$137.SetProcessWorkingSetSizeEx$FUNC
    );
    static final FunctionDescriptor VirtualLock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle VirtualLock$MH = RuntimeHelper.downcallHandle(
        "VirtualLock",
        constants$137.VirtualLock$FUNC
    );
    static final FunctionDescriptor VirtualUnlock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle VirtualUnlock$MH = RuntimeHelper.downcallHandle(
        "VirtualUnlock",
        constants$137.VirtualUnlock$FUNC
    );
    static final FunctionDescriptor GetWriteWatch$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWriteWatch$MH = RuntimeHelper.downcallHandle(
        "GetWriteWatch",
        constants$137.GetWriteWatch$FUNC
    );
}


