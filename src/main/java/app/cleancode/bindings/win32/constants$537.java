// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$537 {

    static final FunctionDescriptor midiInAddBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiInAddBuffer$MH = RuntimeHelper.downcallHandle(
        "midiInAddBuffer",
        constants$537.midiInAddBuffer$FUNC
    );
    static final FunctionDescriptor midiInStart$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle midiInStart$MH = RuntimeHelper.downcallHandle(
        "midiInStart",
        constants$537.midiInStart$FUNC
    );
    static final FunctionDescriptor midiInStop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle midiInStop$MH = RuntimeHelper.downcallHandle(
        "midiInStop",
        constants$537.midiInStop$FUNC
    );
    static final FunctionDescriptor midiInReset$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle midiInReset$MH = RuntimeHelper.downcallHandle(
        "midiInReset",
        constants$537.midiInReset$FUNC
    );
    static final FunctionDescriptor midiInGetID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle midiInGetID$MH = RuntimeHelper.downcallHandle(
        "midiInGetID",
        constants$537.midiInGetID$FUNC
    );
    static final FunctionDescriptor midiInMessage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle midiInMessage$MH = RuntimeHelper.downcallHandle(
        "midiInMessage",
        constants$537.midiInMessage$FUNC
    );
}


