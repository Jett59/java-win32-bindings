// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$538 {

    static final FunctionDescriptor auxGetNumDevs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle auxGetNumDevs$MH = RuntimeHelper.downcallHandle(
        "auxGetNumDevs",
        constants$538.auxGetNumDevs$FUNC
    );
    static final FunctionDescriptor auxGetDevCapsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle auxGetDevCapsA$MH = RuntimeHelper.downcallHandle(
        "auxGetDevCapsA",
        constants$538.auxGetDevCapsA$FUNC
    );
    static final FunctionDescriptor auxGetDevCapsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle auxGetDevCapsW$MH = RuntimeHelper.downcallHandle(
        "auxGetDevCapsW",
        constants$538.auxGetDevCapsW$FUNC
    );
    static final FunctionDescriptor auxSetVolume$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle auxSetVolume$MH = RuntimeHelper.downcallHandle(
        "auxSetVolume",
        constants$538.auxSetVolume$FUNC
    );
    static final FunctionDescriptor auxGetVolume$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle auxGetVolume$MH = RuntimeHelper.downcallHandle(
        "auxGetVolume",
        constants$538.auxGetVolume$FUNC
    );
    static final FunctionDescriptor auxOutMessage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle auxOutMessage$MH = RuntimeHelper.downcallHandle(
        "auxOutMessage",
        constants$538.auxOutMessage$FUNC
    );
}


