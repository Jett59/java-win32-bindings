// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$690 {

    static final FunctionDescriptor CoRevokeClassObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CoRevokeClassObject$MH = RuntimeHelper.downcallHandle(
        "CoRevokeClassObject",
        constants$690.CoRevokeClassObject$FUNC
    );
    static final FunctionDescriptor CoResumeClassObjects$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CoResumeClassObjects$MH = RuntimeHelper.downcallHandle(
        "CoResumeClassObjects",
        constants$690.CoResumeClassObjects$FUNC
    );
    static final FunctionDescriptor CoSuspendClassObjects$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CoSuspendClassObjects$MH = RuntimeHelper.downcallHandle(
        "CoSuspendClassObjects",
        constants$690.CoSuspendClassObjects$FUNC
    );
    static final FunctionDescriptor CoAddRefServerProcess$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CoAddRefServerProcess$MH = RuntimeHelper.downcallHandle(
        "CoAddRefServerProcess",
        constants$690.CoAddRefServerProcess$FUNC
    );
    static final FunctionDescriptor CoReleaseServerProcess$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CoReleaseServerProcess$MH = RuntimeHelper.downcallHandle(
        "CoReleaseServerProcess",
        constants$690.CoReleaseServerProcess$FUNC
    );
    static final FunctionDescriptor CoGetPSClsid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoGetPSClsid$MH = RuntimeHelper.downcallHandle(
        "CoGetPSClsid",
        constants$690.CoGetPSClsid$FUNC
    );
}


