// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$529 {

    static final FunctionDescriptor waveInAddBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveInAddBuffer$MH = RuntimeHelper.downcallHandle(
        "waveInAddBuffer",
        constants$529.waveInAddBuffer$FUNC
    );
    static final FunctionDescriptor waveInStart$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle waveInStart$MH = RuntimeHelper.downcallHandle(
        "waveInStart",
        constants$529.waveInStart$FUNC
    );
    static final FunctionDescriptor waveInStop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle waveInStop$MH = RuntimeHelper.downcallHandle(
        "waveInStop",
        constants$529.waveInStop$FUNC
    );
    static final FunctionDescriptor waveInReset$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle waveInReset$MH = RuntimeHelper.downcallHandle(
        "waveInReset",
        constants$529.waveInReset$FUNC
    );
    static final FunctionDescriptor waveInGetPosition$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveInGetPosition$MH = RuntimeHelper.downcallHandle(
        "waveInGetPosition",
        constants$529.waveInGetPosition$FUNC
    );
    static final FunctionDescriptor waveInGetID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle waveInGetID$MH = RuntimeHelper.downcallHandle(
        "waveInGetID",
        constants$529.waveInGetID$FUNC
    );
}


