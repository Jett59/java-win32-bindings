// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$157 {

    static final FunctionDescriptor QueryThreadProfiling$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryThreadProfiling$MH = RuntimeHelper.downcallHandle(
        "QueryThreadProfiling",
        constants$157.QueryThreadProfiling$FUNC
    );
    static final FunctionDescriptor ReadThreadProfilingData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadThreadProfilingData$MH = RuntimeHelper.downcallHandle(
        "ReadThreadProfilingData",
        constants$157.ReadThreadProfilingData$FUNC
    );
    static final FunctionDescriptor RaiseCustomSystemEventTrigger$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RaiseCustomSystemEventTrigger$MH = RuntimeHelper.downcallHandle(
        "RaiseCustomSystemEventTrigger",
        constants$157.RaiseCustomSystemEventTrigger$FUNC
    );
    static final FunctionDescriptor OLDFONTENUMPROCA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle OLDFONTENUMPROCA$MH = RuntimeHelper.downcallHandle(
        constants$157.OLDFONTENUMPROCA$FUNC
    );
    static final FunctionDescriptor OLDFONTENUMPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
}

