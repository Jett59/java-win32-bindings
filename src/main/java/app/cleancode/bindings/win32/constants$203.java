// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$203 {

    static final FunctionDescriptor CreateSemaphoreA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateSemaphoreA$MH = RuntimeHelper.downcallHandle(
        "CreateSemaphoreA",
        constants$203.CreateSemaphoreA$FUNC
    );
    static final FunctionDescriptor OpenSemaphoreA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenSemaphoreA$MH = RuntimeHelper.downcallHandle(
        "OpenSemaphoreA",
        constants$203.OpenSemaphoreA$FUNC
    );
    static final FunctionDescriptor CreateWaitableTimerA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateWaitableTimerA$MH = RuntimeHelper.downcallHandle(
        "CreateWaitableTimerA",
        constants$203.CreateWaitableTimerA$FUNC
    );
    static final FunctionDescriptor OpenWaitableTimerA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenWaitableTimerA$MH = RuntimeHelper.downcallHandle(
        "OpenWaitableTimerA",
        constants$203.OpenWaitableTimerA$FUNC
    );
    static final FunctionDescriptor CreateSemaphoreExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateSemaphoreExA$MH = RuntimeHelper.downcallHandle(
        "CreateSemaphoreExA",
        constants$203.CreateSemaphoreExA$FUNC
    );
    static final FunctionDescriptor CreateWaitableTimerExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateWaitableTimerExA$MH = RuntimeHelper.downcallHandle(
        "CreateWaitableTimerExA",
        constants$203.CreateWaitableTimerExA$FUNC
    );
}


