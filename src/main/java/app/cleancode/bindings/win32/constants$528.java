// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$528 {

    static final FunctionDescriptor waveInGetErrorTextA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveInGetErrorTextA$MH = RuntimeHelper.downcallHandle(
        "waveInGetErrorTextA",
        constants$528.waveInGetErrorTextA$FUNC
    );
    static final FunctionDescriptor waveInGetErrorTextW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveInGetErrorTextW$MH = RuntimeHelper.downcallHandle(
        "waveInGetErrorTextW",
        constants$528.waveInGetErrorTextW$FUNC
    );
    static final FunctionDescriptor waveInOpen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveInOpen$MH = RuntimeHelper.downcallHandle(
        "waveInOpen",
        constants$528.waveInOpen$FUNC
    );
    static final FunctionDescriptor waveInClose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle waveInClose$MH = RuntimeHelper.downcallHandle(
        "waveInClose",
        constants$528.waveInClose$FUNC
    );
    static final FunctionDescriptor waveInPrepareHeader$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveInPrepareHeader$MH = RuntimeHelper.downcallHandle(
        "waveInPrepareHeader",
        constants$528.waveInPrepareHeader$FUNC
    );
    static final FunctionDescriptor waveInUnprepareHeader$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveInUnprepareHeader$MH = RuntimeHelper.downcallHandle(
        "waveInUnprepareHeader",
        constants$528.waveInUnprepareHeader$FUNC
    );
}


