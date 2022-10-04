// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _currencyfmtA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("NumDigits"),
        Constants$root.C_LONG$LAYOUT.withName("LeadingZero"),
        Constants$root.C_LONG$LAYOUT.withName("Grouping"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpDecimalSep"),
        Constants$root.C_POINTER$LAYOUT.withName("lpThousandSep"),
        Constants$root.C_LONG$LAYOUT.withName("NegativeOrder"),
        Constants$root.C_LONG$LAYOUT.withName("PositiveOrder"),
        Constants$root.C_POINTER$LAYOUT.withName("lpCurrencySymbol")
    ).withName("_currencyfmtA");
    public static MemoryLayout $LAYOUT() {
        return _currencyfmtA.$struct$LAYOUT;
    }
    static final VarHandle NumDigits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumDigits"));
    public static VarHandle NumDigits$VH() {
        return _currencyfmtA.NumDigits$VH;
    }
    public static int NumDigits$get(MemorySegment seg) {
        return (int)_currencyfmtA.NumDigits$VH.get(seg);
    }
    public static void NumDigits$set( MemorySegment seg, int x) {
        _currencyfmtA.NumDigits$VH.set(seg, x);
    }
    public static int NumDigits$get(MemorySegment seg, long index) {
        return (int)_currencyfmtA.NumDigits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumDigits$set(MemorySegment seg, long index, int x) {
        _currencyfmtA.NumDigits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LeadingZero$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LeadingZero"));
    public static VarHandle LeadingZero$VH() {
        return _currencyfmtA.LeadingZero$VH;
    }
    public static int LeadingZero$get(MemorySegment seg) {
        return (int)_currencyfmtA.LeadingZero$VH.get(seg);
    }
    public static void LeadingZero$set( MemorySegment seg, int x) {
        _currencyfmtA.LeadingZero$VH.set(seg, x);
    }
    public static int LeadingZero$get(MemorySegment seg, long index) {
        return (int)_currencyfmtA.LeadingZero$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LeadingZero$set(MemorySegment seg, long index, int x) {
        _currencyfmtA.LeadingZero$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Grouping$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Grouping"));
    public static VarHandle Grouping$VH() {
        return _currencyfmtA.Grouping$VH;
    }
    public static int Grouping$get(MemorySegment seg) {
        return (int)_currencyfmtA.Grouping$VH.get(seg);
    }
    public static void Grouping$set( MemorySegment seg, int x) {
        _currencyfmtA.Grouping$VH.set(seg, x);
    }
    public static int Grouping$get(MemorySegment seg, long index) {
        return (int)_currencyfmtA.Grouping$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Grouping$set(MemorySegment seg, long index, int x) {
        _currencyfmtA.Grouping$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpDecimalSep$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpDecimalSep"));
    public static VarHandle lpDecimalSep$VH() {
        return _currencyfmtA.lpDecimalSep$VH;
    }
    public static MemoryAddress lpDecimalSep$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_currencyfmtA.lpDecimalSep$VH.get(seg);
    }
    public static void lpDecimalSep$set( MemorySegment seg, MemoryAddress x) {
        _currencyfmtA.lpDecimalSep$VH.set(seg, x);
    }
    public static MemoryAddress lpDecimalSep$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_currencyfmtA.lpDecimalSep$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpDecimalSep$set(MemorySegment seg, long index, MemoryAddress x) {
        _currencyfmtA.lpDecimalSep$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpThousandSep$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpThousandSep"));
    public static VarHandle lpThousandSep$VH() {
        return _currencyfmtA.lpThousandSep$VH;
    }
    public static MemoryAddress lpThousandSep$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_currencyfmtA.lpThousandSep$VH.get(seg);
    }
    public static void lpThousandSep$set( MemorySegment seg, MemoryAddress x) {
        _currencyfmtA.lpThousandSep$VH.set(seg, x);
    }
    public static MemoryAddress lpThousandSep$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_currencyfmtA.lpThousandSep$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpThousandSep$set(MemorySegment seg, long index, MemoryAddress x) {
        _currencyfmtA.lpThousandSep$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NegativeOrder$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NegativeOrder"));
    public static VarHandle NegativeOrder$VH() {
        return _currencyfmtA.NegativeOrder$VH;
    }
    public static int NegativeOrder$get(MemorySegment seg) {
        return (int)_currencyfmtA.NegativeOrder$VH.get(seg);
    }
    public static void NegativeOrder$set( MemorySegment seg, int x) {
        _currencyfmtA.NegativeOrder$VH.set(seg, x);
    }
    public static int NegativeOrder$get(MemorySegment seg, long index) {
        return (int)_currencyfmtA.NegativeOrder$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NegativeOrder$set(MemorySegment seg, long index, int x) {
        _currencyfmtA.NegativeOrder$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PositiveOrder$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PositiveOrder"));
    public static VarHandle PositiveOrder$VH() {
        return _currencyfmtA.PositiveOrder$VH;
    }
    public static int PositiveOrder$get(MemorySegment seg) {
        return (int)_currencyfmtA.PositiveOrder$VH.get(seg);
    }
    public static void PositiveOrder$set( MemorySegment seg, int x) {
        _currencyfmtA.PositiveOrder$VH.set(seg, x);
    }
    public static int PositiveOrder$get(MemorySegment seg, long index) {
        return (int)_currencyfmtA.PositiveOrder$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PositiveOrder$set(MemorySegment seg, long index, int x) {
        _currencyfmtA.PositiveOrder$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpCurrencySymbol$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpCurrencySymbol"));
    public static VarHandle lpCurrencySymbol$VH() {
        return _currencyfmtA.lpCurrencySymbol$VH;
    }
    public static MemoryAddress lpCurrencySymbol$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_currencyfmtA.lpCurrencySymbol$VH.get(seg);
    }
    public static void lpCurrencySymbol$set( MemorySegment seg, MemoryAddress x) {
        _currencyfmtA.lpCurrencySymbol$VH.set(seg, x);
    }
    public static MemoryAddress lpCurrencySymbol$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_currencyfmtA.lpCurrencySymbol$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpCurrencySymbol$set(MemorySegment seg, long index, MemoryAddress x) {
        _currencyfmtA.lpCurrencySymbol$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


