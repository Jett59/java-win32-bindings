// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$722 {

    static final FunctionDescriptor EvtSubscribe$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EvtSubscribe$MH = RuntimeHelper.downcallHandle(
        "EvtSubscribe",
        constants$722.EvtSubscribe$FUNC
    );
    static final FunctionDescriptor EvtCreateRenderContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EvtCreateRenderContext$MH = RuntimeHelper.downcallHandle(
        "EvtCreateRenderContext",
        constants$722.EvtCreateRenderContext$FUNC
    );
    static final FunctionDescriptor EvtRender$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EvtRender$MH = RuntimeHelper.downcallHandle(
        "EvtRender",
        constants$722.EvtRender$FUNC
    );
    static final FunctionDescriptor EvtFormatMessage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EvtFormatMessage$MH = RuntimeHelper.downcallHandle(
        "EvtFormatMessage",
        constants$722.EvtFormatMessage$FUNC
    );
    static final FunctionDescriptor EvtOpenLog$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EvtOpenLog$MH = RuntimeHelper.downcallHandle(
        "EvtOpenLog",
        constants$722.EvtOpenLog$FUNC
    );
    static final FunctionDescriptor EvtGetLogInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EvtGetLogInfo$MH = RuntimeHelper.downcallHandle(
        "EvtGetLogInfo",
        constants$722.EvtGetLogInfo$FUNC
    );
}


