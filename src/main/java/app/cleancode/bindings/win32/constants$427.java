// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$427 {

    static final FunctionDescriptor CryptMsgOpenToDecode$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptMsgOpenToDecode$MH = RuntimeHelper.downcallHandle(
        "CryptMsgOpenToDecode",
        constants$427.CryptMsgOpenToDecode$FUNC
    );
    static final FunctionDescriptor CryptMsgDuplicate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptMsgDuplicate$MH = RuntimeHelper.downcallHandle(
        "CryptMsgDuplicate",
        constants$427.CryptMsgDuplicate$FUNC
    );
    static final FunctionDescriptor CryptMsgClose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptMsgClose$MH = RuntimeHelper.downcallHandle(
        "CryptMsgClose",
        constants$427.CryptMsgClose$FUNC
    );
    static final FunctionDescriptor CryptMsgUpdate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptMsgUpdate$MH = RuntimeHelper.downcallHandle(
        "CryptMsgUpdate",
        constants$427.CryptMsgUpdate$FUNC
    );
    static final FunctionDescriptor CryptMsgGetParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptMsgGetParam$MH = RuntimeHelper.downcallHandle(
        "CryptMsgGetParam",
        constants$427.CryptMsgGetParam$FUNC
    );
    static final FunctionDescriptor CryptMsgControl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptMsgControl$MH = RuntimeHelper.downcallHandle(
        "CryptMsgControl",
        constants$427.CryptMsgControl$FUNC
    );
}


