// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$94 {

    static final FunctionDescriptor TerminateProcessOnMemoryExhaustion$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle TerminateProcessOnMemoryExhaustion$MH = RuntimeHelper.downcallHandle(
        "TerminateProcessOnMemoryExhaustion",
        constants$94.TerminateProcessOnMemoryExhaustion$FUNC
    );
    static final FunctionDescriptor FlsAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FlsAlloc$MH = RuntimeHelper.downcallHandle(
        "FlsAlloc",
        constants$94.FlsAlloc$FUNC
    );
    static final FunctionDescriptor FlsGetValue$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FlsGetValue$MH = RuntimeHelper.downcallHandle(
        "FlsGetValue",
        constants$94.FlsGetValue$FUNC
    );
    static final FunctionDescriptor FlsSetValue$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FlsSetValue$MH = RuntimeHelper.downcallHandle(
        "FlsSetValue",
        constants$94.FlsSetValue$FUNC
    );
    static final FunctionDescriptor FlsFree$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FlsFree$MH = RuntimeHelper.downcallHandle(
        "FlsFree",
        constants$94.FlsFree$FUNC
    );
    static final FunctionDescriptor IsThreadAFiber$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle IsThreadAFiber$MH = RuntimeHelper.downcallHandle(
        "IsThreadAFiber",
        constants$94.IsThreadAFiber$FUNC
    );
}


