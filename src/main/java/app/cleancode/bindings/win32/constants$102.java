// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$102 {

    static final FunctionDescriptor InitializeCriticalSectionEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle InitializeCriticalSectionEx$MH = RuntimeHelper.downcallHandle(
        "InitializeCriticalSectionEx",
        constants$102.InitializeCriticalSectionEx$FUNC
    );
    static final FunctionDescriptor SetCriticalSectionSpinCount$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetCriticalSectionSpinCount$MH = RuntimeHelper.downcallHandle(
        "SetCriticalSectionSpinCount",
        constants$102.SetCriticalSectionSpinCount$FUNC
    );
    static final FunctionDescriptor TryEnterCriticalSection$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TryEnterCriticalSection$MH = RuntimeHelper.downcallHandle(
        "TryEnterCriticalSection",
        constants$102.TryEnterCriticalSection$FUNC
    );
    static final FunctionDescriptor DeleteCriticalSection$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteCriticalSection$MH = RuntimeHelper.downcallHandle(
        "DeleteCriticalSection",
        constants$102.DeleteCriticalSection$FUNC
    );
    static final FunctionDescriptor PINIT_ONCE_FN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PINIT_ONCE_FN$MH = RuntimeHelper.downcallHandle(
        constants$102.PINIT_ONCE_FN$FUNC
    );
}


