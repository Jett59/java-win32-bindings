// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagJOYCAPSW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wMid"),
        Constants$root.C_SHORT$LAYOUT.withName("wPid"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("szPname"),
        Constants$root.C_LONG$LAYOUT.withName("wXmin"),
        Constants$root.C_LONG$LAYOUT.withName("wXmax"),
        Constants$root.C_LONG$LAYOUT.withName("wYmin"),
        Constants$root.C_LONG$LAYOUT.withName("wYmax"),
        Constants$root.C_LONG$LAYOUT.withName("wZmin"),
        Constants$root.C_LONG$LAYOUT.withName("wZmax"),
        Constants$root.C_LONG$LAYOUT.withName("wNumButtons"),
        Constants$root.C_LONG$LAYOUT.withName("wPeriodMin"),
        Constants$root.C_LONG$LAYOUT.withName("wPeriodMax"),
        Constants$root.C_LONG$LAYOUT.withName("wRmin"),
        Constants$root.C_LONG$LAYOUT.withName("wRmax"),
        Constants$root.C_LONG$LAYOUT.withName("wUmin"),
        Constants$root.C_LONG$LAYOUT.withName("wUmax"),
        Constants$root.C_LONG$LAYOUT.withName("wVmin"),
        Constants$root.C_LONG$LAYOUT.withName("wVmax"),
        Constants$root.C_LONG$LAYOUT.withName("wCaps"),
        Constants$root.C_LONG$LAYOUT.withName("wMaxAxes"),
        Constants$root.C_LONG$LAYOUT.withName("wNumAxes"),
        Constants$root.C_LONG$LAYOUT.withName("wMaxButtons"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("szRegKey"),
        MemoryLayout.sequenceLayout(260, Constants$root.C_SHORT$LAYOUT).withName("szOEMVxD")
    ).withName("tagJOYCAPSW");
    public static MemoryLayout $LAYOUT() {
        return tagJOYCAPSW.$struct$LAYOUT;
    }
    static final VarHandle wMid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMid"));
    public static VarHandle wMid$VH() {
        return tagJOYCAPSW.wMid$VH;
    }
    public static short wMid$get(MemorySegment seg) {
        return (short)tagJOYCAPSW.wMid$VH.get(seg);
    }
    public static void wMid$set( MemorySegment seg, short x) {
        tagJOYCAPSW.wMid$VH.set(seg, x);
    }
    public static short wMid$get(MemorySegment seg, long index) {
        return (short)tagJOYCAPSW.wMid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMid$set(MemorySegment seg, long index, short x) {
        tagJOYCAPSW.wMid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPid"));
    public static VarHandle wPid$VH() {
        return tagJOYCAPSW.wPid$VH;
    }
    public static short wPid$get(MemorySegment seg) {
        return (short)tagJOYCAPSW.wPid$VH.get(seg);
    }
    public static void wPid$set( MemorySegment seg, short x) {
        tagJOYCAPSW.wPid$VH.set(seg, x);
    }
    public static short wPid$get(MemorySegment seg, long index) {
        return (short)tagJOYCAPSW.wPid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPid$set(MemorySegment seg, long index, short x) {
        tagJOYCAPSW.wPid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szPname$slice(MemorySegment seg) {
        return seg.asSlice(4, 64);
    }
    static final VarHandle wXmin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wXmin"));
    public static VarHandle wXmin$VH() {
        return tagJOYCAPSW.wXmin$VH;
    }
    public static int wXmin$get(MemorySegment seg) {
        return (int)tagJOYCAPSW.wXmin$VH.get(seg);
    }
    public static void wXmin$set( MemorySegment seg, int x) {
        tagJOYCAPSW.wXmin$VH.set(seg, x);
    }
    public static int wXmin$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPSW.wXmin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wXmin$set(MemorySegment seg, long index, int x) {
        tagJOYCAPSW.wXmin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wXmax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wXmax"));
    public static VarHandle wXmax$VH() {
        return tagJOYCAPSW.wXmax$VH;
    }
    public static int wXmax$get(MemorySegment seg) {
        return (int)tagJOYCAPSW.wXmax$VH.get(seg);
    }
    public static void wXmax$set( MemorySegment seg, int x) {
        tagJOYCAPSW.wXmax$VH.set(seg, x);
    }
    public static int wXmax$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPSW.wXmax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wXmax$set(MemorySegment seg, long index, int x) {
        tagJOYCAPSW.wXmax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wYmin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wYmin"));
    public static VarHandle wYmin$VH() {
        return tagJOYCAPSW.wYmin$VH;
    }
    public static int wYmin$get(MemorySegment seg) {
        return (int)tagJOYCAPSW.wYmin$VH.get(seg);
    }
    public static void wYmin$set( MemorySegment seg, int x) {
        tagJOYCAPSW.wYmin$VH.set(seg, x);
    }
    public static int wYmin$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPSW.wYmin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wYmin$set(MemorySegment seg, long index, int x) {
        tagJOYCAPSW.wYmin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wYmax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wYmax"));
    public static VarHandle wYmax$VH() {
        return tagJOYCAPSW.wYmax$VH;
    }
    public static int wYmax$get(MemorySegment seg) {
        return (int)tagJOYCAPSW.wYmax$VH.get(seg);
    }
    public static void wYmax$set( MemorySegment seg, int x) {
        tagJOYCAPSW.wYmax$VH.set(seg, x);
    }
    public static int wYmax$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPSW.wYmax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wYmax$set(MemorySegment seg, long index, int x) {
        tagJOYCAPSW.wYmax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wZmin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wZmin"));
    public static VarHandle wZmin$VH() {
        return tagJOYCAPSW.wZmin$VH;
    }
    public static int wZmin$get(MemorySegment seg) {
        return (int)tagJOYCAPSW.wZmin$VH.get(seg);
    }
    public static void wZmin$set( MemorySegment seg, int x) {
        tagJOYCAPSW.wZmin$VH.set(seg, x);
    }
    public static int wZmin$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPSW.wZmin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wZmin$set(MemorySegment seg, long index, int x) {
        tagJOYCAPSW.wZmin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wZmax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wZmax"));
    public static VarHandle wZmax$VH() {
        return tagJOYCAPSW.wZmax$VH;
    }
    public static int wZmax$get(MemorySegment seg) {
        return (int)tagJOYCAPSW.wZmax$VH.get(seg);
    }
    public static void wZmax$set( MemorySegment seg, int x) {
        tagJOYCAPSW.wZmax$VH.set(seg, x);
    }
    public static int wZmax$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPSW.wZmax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wZmax$set(MemorySegment seg, long index, int x) {
        tagJOYCAPSW.wZmax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wNumButtons$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wNumButtons"));
    public static VarHandle wNumButtons$VH() {
        return tagJOYCAPSW.wNumButtons$VH;
    }
    public static int wNumButtons$get(MemorySegment seg) {
        return (int)tagJOYCAPSW.wNumButtons$VH.get(seg);
    }
    public static void wNumButtons$set( MemorySegment seg, int x) {
        tagJOYCAPSW.wNumButtons$VH.set(seg, x);
    }
    public static int wNumButtons$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPSW.wNumButtons$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wNumButtons$set(MemorySegment seg, long index, int x) {
        tagJOYCAPSW.wNumButtons$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPeriodMin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPeriodMin"));
    public static VarHandle wPeriodMin$VH() {
        return tagJOYCAPSW.wPeriodMin$VH;
    }
    public static int wPeriodMin$get(MemorySegment seg) {
        return (int)tagJOYCAPSW.wPeriodMin$VH.get(seg);
    }
    public static void wPeriodMin$set( MemorySegment seg, int x) {
        tagJOYCAPSW.wPeriodMin$VH.set(seg, x);
    }
    public static int wPeriodMin$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPSW.wPeriodMin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPeriodMin$set(MemorySegment seg, long index, int x) {
        tagJOYCAPSW.wPeriodMin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPeriodMax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPeriodMax"));
    public static VarHandle wPeriodMax$VH() {
        return tagJOYCAPSW.wPeriodMax$VH;
    }
    public static int wPeriodMax$get(MemorySegment seg) {
        return (int)tagJOYCAPSW.wPeriodMax$VH.get(seg);
    }
    public static void wPeriodMax$set( MemorySegment seg, int x) {
        tagJOYCAPSW.wPeriodMax$VH.set(seg, x);
    }
    public static int wPeriodMax$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPSW.wPeriodMax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPeriodMax$set(MemorySegment seg, long index, int x) {
        tagJOYCAPSW.wPeriodMax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wRmin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wRmin"));
    public static VarHandle wRmin$VH() {
        return tagJOYCAPSW.wRmin$VH;
    }
    public static int wRmin$get(MemorySegment seg) {
        return (int)tagJOYCAPSW.wRmin$VH.get(seg);
    }
    public static void wRmin$set( MemorySegment seg, int x) {
        tagJOYCAPSW.wRmin$VH.set(seg, x);
    }
    public static int wRmin$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPSW.wRmin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wRmin$set(MemorySegment seg, long index, int x) {
        tagJOYCAPSW.wRmin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wRmax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wRmax"));
    public static VarHandle wRmax$VH() {
        return tagJOYCAPSW.wRmax$VH;
    }
    public static int wRmax$get(MemorySegment seg) {
        return (int)tagJOYCAPSW.wRmax$VH.get(seg);
    }
    public static void wRmax$set( MemorySegment seg, int x) {
        tagJOYCAPSW.wRmax$VH.set(seg, x);
    }
    public static int wRmax$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPSW.wRmax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wRmax$set(MemorySegment seg, long index, int x) {
        tagJOYCAPSW.wRmax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wUmin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wUmin"));
    public static VarHandle wUmin$VH() {
        return tagJOYCAPSW.wUmin$VH;
    }
    public static int wUmin$get(MemorySegment seg) {
        return (int)tagJOYCAPSW.wUmin$VH.get(seg);
    }
    public static void wUmin$set( MemorySegment seg, int x) {
        tagJOYCAPSW.wUmin$VH.set(seg, x);
    }
    public static int wUmin$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPSW.wUmin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wUmin$set(MemorySegment seg, long index, int x) {
        tagJOYCAPSW.wUmin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wUmax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wUmax"));
    public static VarHandle wUmax$VH() {
        return tagJOYCAPSW.wUmax$VH;
    }
    public static int wUmax$get(MemorySegment seg) {
        return (int)tagJOYCAPSW.wUmax$VH.get(seg);
    }
    public static void wUmax$set( MemorySegment seg, int x) {
        tagJOYCAPSW.wUmax$VH.set(seg, x);
    }
    public static int wUmax$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPSW.wUmax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wUmax$set(MemorySegment seg, long index, int x) {
        tagJOYCAPSW.wUmax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wVmin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wVmin"));
    public static VarHandle wVmin$VH() {
        return tagJOYCAPSW.wVmin$VH;
    }
    public static int wVmin$get(MemorySegment seg) {
        return (int)tagJOYCAPSW.wVmin$VH.get(seg);
    }
    public static void wVmin$set( MemorySegment seg, int x) {
        tagJOYCAPSW.wVmin$VH.set(seg, x);
    }
    public static int wVmin$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPSW.wVmin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wVmin$set(MemorySegment seg, long index, int x) {
        tagJOYCAPSW.wVmin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wVmax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wVmax"));
    public static VarHandle wVmax$VH() {
        return tagJOYCAPSW.wVmax$VH;
    }
    public static int wVmax$get(MemorySegment seg) {
        return (int)tagJOYCAPSW.wVmax$VH.get(seg);
    }
    public static void wVmax$set( MemorySegment seg, int x) {
        tagJOYCAPSW.wVmax$VH.set(seg, x);
    }
    public static int wVmax$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPSW.wVmax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wVmax$set(MemorySegment seg, long index, int x) {
        tagJOYCAPSW.wVmax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wCaps$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wCaps"));
    public static VarHandle wCaps$VH() {
        return tagJOYCAPSW.wCaps$VH;
    }
    public static int wCaps$get(MemorySegment seg) {
        return (int)tagJOYCAPSW.wCaps$VH.get(seg);
    }
    public static void wCaps$set( MemorySegment seg, int x) {
        tagJOYCAPSW.wCaps$VH.set(seg, x);
    }
    public static int wCaps$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPSW.wCaps$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wCaps$set(MemorySegment seg, long index, int x) {
        tagJOYCAPSW.wCaps$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wMaxAxes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMaxAxes"));
    public static VarHandle wMaxAxes$VH() {
        return tagJOYCAPSW.wMaxAxes$VH;
    }
    public static int wMaxAxes$get(MemorySegment seg) {
        return (int)tagJOYCAPSW.wMaxAxes$VH.get(seg);
    }
    public static void wMaxAxes$set( MemorySegment seg, int x) {
        tagJOYCAPSW.wMaxAxes$VH.set(seg, x);
    }
    public static int wMaxAxes$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPSW.wMaxAxes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMaxAxes$set(MemorySegment seg, long index, int x) {
        tagJOYCAPSW.wMaxAxes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wNumAxes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wNumAxes"));
    public static VarHandle wNumAxes$VH() {
        return tagJOYCAPSW.wNumAxes$VH;
    }
    public static int wNumAxes$get(MemorySegment seg) {
        return (int)tagJOYCAPSW.wNumAxes$VH.get(seg);
    }
    public static void wNumAxes$set( MemorySegment seg, int x) {
        tagJOYCAPSW.wNumAxes$VH.set(seg, x);
    }
    public static int wNumAxes$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPSW.wNumAxes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wNumAxes$set(MemorySegment seg, long index, int x) {
        tagJOYCAPSW.wNumAxes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wMaxButtons$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMaxButtons"));
    public static VarHandle wMaxButtons$VH() {
        return tagJOYCAPSW.wMaxButtons$VH;
    }
    public static int wMaxButtons$get(MemorySegment seg) {
        return (int)tagJOYCAPSW.wMaxButtons$VH.get(seg);
    }
    public static void wMaxButtons$set( MemorySegment seg, int x) {
        tagJOYCAPSW.wMaxButtons$VH.set(seg, x);
    }
    public static int wMaxButtons$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPSW.wMaxButtons$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMaxButtons$set(MemorySegment seg, long index, int x) {
        tagJOYCAPSW.wMaxButtons$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szRegKey$slice(MemorySegment seg) {
        return seg.asSlice(144, 64);
    }
    public static MemorySegment szOEMVxD$slice(MemorySegment seg) {
        return seg.asSlice(208, 520);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


