// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$103 {

    static final FunctionDescriptor InitOnceInitialize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InitOnceInitialize$MH = RuntimeHelper.downcallHandle(
        "InitOnceInitialize",
        constants$103.InitOnceInitialize$FUNC
    );
    static final FunctionDescriptor InitOnceExecuteOnce$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InitOnceExecuteOnce$MH = RuntimeHelper.downcallHandle(
        "InitOnceExecuteOnce",
        constants$103.InitOnceExecuteOnce$FUNC
    );
    static final FunctionDescriptor InitOnceBeginInitialize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InitOnceBeginInitialize$MH = RuntimeHelper.downcallHandle(
        "InitOnceBeginInitialize",
        constants$103.InitOnceBeginInitialize$FUNC
    );
    static final FunctionDescriptor InitOnceComplete$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InitOnceComplete$MH = RuntimeHelper.downcallHandle(
        "InitOnceComplete",
        constants$103.InitOnceComplete$FUNC
    );
    static final FunctionDescriptor InitializeConditionVariable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InitializeConditionVariable$MH = RuntimeHelper.downcallHandle(
        "InitializeConditionVariable",
        constants$103.InitializeConditionVariable$FUNC
    );
    static final FunctionDescriptor WakeConditionVariable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WakeConditionVariable$MH = RuntimeHelper.downcallHandle(
        "WakeConditionVariable",
        constants$103.WakeConditionVariable$FUNC
    );
}


