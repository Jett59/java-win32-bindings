// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$107 {

    static final FunctionDescriptor OpenSemaphoreW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenSemaphoreW$MH = RuntimeHelper.downcallHandle(
        "OpenSemaphoreW",
        constants$107.OpenSemaphoreW$FUNC
    );
    static final FunctionDescriptor PTIMERAPCROUTINE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PTIMERAPCROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$107.PTIMERAPCROUTINE$FUNC
    );
    static final FunctionDescriptor OpenWaitableTimerW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenWaitableTimerW$MH = RuntimeHelper.downcallHandle(
        "OpenWaitableTimerW",
        constants$107.OpenWaitableTimerW$FUNC
    );
    static final FunctionDescriptor SetWaitableTimerEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetWaitableTimerEx$MH = RuntimeHelper.downcallHandle(
        "SetWaitableTimerEx",
        constants$107.SetWaitableTimerEx$FUNC
    );
    static final FunctionDescriptor SetWaitableTimer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetWaitableTimer$MH = RuntimeHelper.downcallHandle(
        "SetWaitableTimer",
        constants$107.SetWaitableTimer$FUNC
    );
}


