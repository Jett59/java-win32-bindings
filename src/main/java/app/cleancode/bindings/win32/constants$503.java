// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$503 {

    static final FunctionDescriptor LPOCNCONNPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPOCNCONNPROCW$MH = RuntimeHelper.downcallHandle(
        constants$503.LPOCNCONNPROCW$FUNC
    );
    static final FunctionDescriptor LPOCNCHKPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPOCNCHKPROC$MH = RuntimeHelper.downcallHandle(
        constants$503.LPOCNCHKPROC$FUNC
    );
    static final FunctionDescriptor LPOCNDSCPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPOCNDSCPROC$MH = RuntimeHelper.downcallHandle(
        constants$503.LPOCNDSCPROC$FUNC
    );
    static final FunctionDescriptor SCardUIDlgSelectCardA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardUIDlgSelectCardA$MH = RuntimeHelper.downcallHandle(
        "SCardUIDlgSelectCardA",
        constants$503.SCardUIDlgSelectCardA$FUNC
    );
}

