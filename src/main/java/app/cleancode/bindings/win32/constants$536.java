// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$536 {

    static final FunctionDescriptor midiInGetErrorTextA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiInGetErrorTextA$MH = RuntimeHelper.downcallHandle(
        "midiInGetErrorTextA",
        constants$536.midiInGetErrorTextA$FUNC
    );
    static final FunctionDescriptor midiInGetErrorTextW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiInGetErrorTextW$MH = RuntimeHelper.downcallHandle(
        "midiInGetErrorTextW",
        constants$536.midiInGetErrorTextW$FUNC
    );
    static final FunctionDescriptor midiInOpen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiInOpen$MH = RuntimeHelper.downcallHandle(
        "midiInOpen",
        constants$536.midiInOpen$FUNC
    );
    static final FunctionDescriptor midiInClose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle midiInClose$MH = RuntimeHelper.downcallHandle(
        "midiInClose",
        constants$536.midiInClose$FUNC
    );
    static final FunctionDescriptor midiInPrepareHeader$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiInPrepareHeader$MH = RuntimeHelper.downcallHandle(
        "midiInPrepareHeader",
        constants$536.midiInPrepareHeader$FUNC
    );
    static final FunctionDescriptor midiInUnprepareHeader$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiInUnprepareHeader$MH = RuntimeHelper.downcallHandle(
        "midiInUnprepareHeader",
        constants$536.midiInUnprepareHeader$FUNC
    );
}


