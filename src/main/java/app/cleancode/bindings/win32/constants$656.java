// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$656 {

    static final FunctionDescriptor LPOCNCONNPROCA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPOCNCONNPROCA$MH = RuntimeHelper.downcallHandle(
        constants$656.LPOCNCONNPROCA$FUNC
    );
    static final FunctionDescriptor LPOCNCONNPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPOCNCONNPROCW$MH = RuntimeHelper.downcallHandle(
        constants$656.LPOCNCONNPROCW$FUNC
    );
    static final FunctionDescriptor LPOCNCHKPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPOCNCHKPROC$MH = RuntimeHelper.downcallHandle(
        constants$656.LPOCNCHKPROC$FUNC
    );
    static final FunctionDescriptor LPOCNDSCPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


