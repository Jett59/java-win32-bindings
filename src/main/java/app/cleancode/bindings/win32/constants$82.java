// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$82 {

    static final FunctionDescriptor UmsThreadYield$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UmsThreadYield$MH = RuntimeHelper.downcallHandle(
        "UmsThreadYield",
        constants$82.UmsThreadYield$FUNC
    );
    static final FunctionDescriptor DeleteUmsCompletionList$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteUmsCompletionList$MH = RuntimeHelper.downcallHandle(
        "DeleteUmsCompletionList",
        constants$82.DeleteUmsCompletionList$FUNC
    );
    static final FunctionDescriptor GetCurrentUmsThread$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetCurrentUmsThread$MH = RuntimeHelper.downcallHandle(
        "GetCurrentUmsThread",
        constants$82.GetCurrentUmsThread$FUNC
    );
    static final FunctionDescriptor GetNextUmsListItem$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNextUmsListItem$MH = RuntimeHelper.downcallHandle(
        "GetNextUmsListItem",
        constants$82.GetNextUmsListItem$FUNC
    );
    static final FunctionDescriptor QueryUmsThreadInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryUmsThreadInformation$MH = RuntimeHelper.downcallHandle(
        "QueryUmsThreadInformation",
        constants$82.QueryUmsThreadInformation$FUNC
    );
    static final FunctionDescriptor SetUmsThreadInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetUmsThreadInformation$MH = RuntimeHelper.downcallHandle(
        "SetUmsThreadInformation",
        constants$82.SetUmsThreadInformation$FUNC
    );
}


