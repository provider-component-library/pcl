package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I6Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i7Provider;
    @Hard
    private final Provider<Integer> i10Provider;
    @Hard
    private final Provider<Integer> i14Provider;
    @Hard
    private final Provider<Integer> i16Provider;
    @Hard
    private final Provider<Integer> i18Provider;
    @Hard
    private final Provider<Integer> i23Provider;
    @Hard
    private final Provider<Integer> i24Provider;
    @Hard
    private final Provider<Integer> i27Provider;
    @Hard
    private final Provider<Integer> i32Provider;
    @Hard
    private final Provider<Integer> i34Provider;
    @Hard
    private final Provider<Integer> i35Provider;
    @Hard
    private final Provider<Integer> i38Provider;
    @Hard
    private final Provider<Integer> i41Provider;
    @Hard
    private final Provider<Integer> i44Provider;
    @Hard
    private final Provider<Integer> i46Provider;
    @Hard
    private final Provider<Integer> i50Provider;
    @Hard
    private final Provider<Integer> i52Provider;
    @Hard
    private final Provider<Integer> i62Provider;
    @Hard
    private final Provider<Integer> i63Provider;
    @Hard
    private final Provider<Integer> i65Provider;
    @Hard
    private final Provider<Integer> i68Provider;
    @Hard
    private final Provider<Integer> i70Provider;
    @Hard
    private final Provider<Integer> i73Provider;
    @Hard
    private final Provider<Integer> i75Provider;
    @Hard
    private final Provider<Integer> i77Provider;
    @Hard
    private final Provider<Integer> i80Provider;
    @Hard
    private final Provider<Integer> i81Provider;
    @Hard
    private final Provider<Integer> i85Provider;
    @Hard
    private final Provider<Integer> i86Provider;
    @Hard
    private final Provider<Integer> i89Provider;
    @Hard
    private final Provider<Integer> i91Provider;
    @Hard
    private final Provider<Integer> i94Provider;
    @Hard
    private final Provider<Integer> i97Provider;
    @Hard
    private final Provider<Integer> i99Provider;
    @Hard
    private final Provider<Integer> i101Provider;
    @Hard
    private final Provider<Integer> i102Provider;
    @Hard
    private final Provider<Integer> i105Provider;
    @Hard
    private final Provider<Integer> i111Provider;
    @Hard
    private final Provider<Integer> i113Provider;
    @Hard
    private final Provider<Integer> i114Provider;
    @Hard
    private final Provider<Integer> i116Provider;
    @Hard
    private final Provider<Integer> i117Provider;
    @Hard
    private final Provider<Integer> i119Provider;
    @Hard
    private final Provider<Integer> i121Provider;
    @Hard
    private final Provider<Integer> i124Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i131Provider;
    @Hard
    private final Provider<Integer> i132Provider;
    @Hard
    private final Provider<Integer> i136Provider;
    @Hard
    private final Provider<Integer> i137Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i157Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i197Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b5Provider.get(request);
		int p4Val = b8Provider.get(request);
		
        try {
            Thread.sleep(46);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p5Val = b12Provider.get(request);
		int p6Val = b13Provider.get(request);
		int p7Val = b15Provider.get(request);
		int p8Val = b16Provider.get(request);
		int p9Val = b20Provider.get(request);
		int p10Val = b22Provider.get(request);
		int p11Val = b23Provider.get(request);
		int p12Val = b24Provider.get(request);
		int p13Val = b29Provider.get(request);
		int p14Val = b31Provider.get(request);
		int p15Val = b37Provider.get(request);
		int p16Val = b41Provider.get(request);
		int p17Val = b43Provider.get(request);
		int p18Val = b45Provider.get(request);
		int p19Val = b46Provider.get(request);
		int p20Val = b49Provider.get(request);
		int p21Val = i7Provider.get(request);
		int p22Val = i10Provider.get(request);
		int p23Val = i14Provider.get(request);
		int p24Val = i16Provider.get(request);
		int p25Val = i18Provider.get(request);
		int p26Val = i23Provider.get(request);
		int p27Val = i24Provider.get(request);
		int p28Val = i27Provider.get(request);
		int p29Val = i32Provider.get(request);
		int p30Val = i34Provider.get(request);
		int p31Val = i35Provider.get(request);
		int p32Val = i38Provider.get(request);
		int p33Val = i41Provider.get(request);
		int p34Val = i44Provider.get(request);
		int p35Val = i46Provider.get(request);
		int p36Val = i50Provider.get(request);
		int p37Val = i52Provider.get(request);
		int p38Val = i62Provider.get(request);
		int p39Val = i63Provider.get(request);
		int p40Val = i65Provider.get(request);
		int p41Val = i68Provider.get(request);
		int p42Val = i70Provider.get(request);
		int p43Val = i73Provider.get(request);
		int p44Val = i75Provider.get(request);
		int p45Val = i77Provider.get(request);
		int p46Val = i80Provider.get(request);
		int p47Val = i81Provider.get(request);
		int p48Val = i85Provider.get(request);
		int p49Val = i86Provider.get(request);
		int p50Val = i89Provider.get(request);
		int p51Val = i91Provider.get(request);
		int p52Val = i94Provider.get(request);
		int p53Val = i97Provider.get(request);
		int p54Val = i99Provider.get(request);
		int p55Val = i101Provider.get(request);
		int p56Val = i102Provider.get(request);
		int p57Val = i105Provider.get(request);
		int p58Val = i111Provider.get(request);
		int p59Val = i113Provider.get(request);
		int p60Val = i114Provider.get(request);
		int p61Val = i116Provider.get(request);
		int p62Val = i117Provider.get(request);
		int p63Val = i119Provider.get(request);
		int p64Val = i121Provider.get(request);
		int p65Val = i124Provider.get(request);
		int p66Val = i125Provider.get(request);
		int p67Val = i126Provider.get(request);
		int p68Val = i128Provider.get(request);
		int p69Val = i131Provider.get(request);
		int p70Val = i132Provider.get(request);
		int p71Val = i136Provider.get(request);
		int p72Val = i137Provider.get(request);
		int p73Val = i142Provider.get(request);
		int p74Val = i144Provider.get(request);
		int p75Val = i156Provider.get(request);
		int p76Val = i157Provider.get(request);
		int p77Val = i161Provider.get(request);
		int p78Val = i162Provider.get(request);
		
        try {
            Thread.sleep(51);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p79Val = i163Provider.get(request);
		int p80Val = i164Provider.get(request);
		int p81Val = i169Provider.get(request);
		int p82Val = i171Provider.get(request);
		int p83Val = i172Provider.get(request);
		int p84Val = i175Provider.get(request);
		
        try {
            Thread.sleep(25);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p85Val = i183Provider.get(request);
		int p86Val = i193Provider.get(request);
		int p87Val = i196Provider.get(request);
		int p88Val = i197Provider.get(request);

        return p1Val +
				p2Val +
				p3Val +
				p4Val +
				p5Val +
				p6Val +
				p7Val +
				p8Val +
				p9Val +
				p10Val +
				p11Val +
				p12Val +
				p13Val +
				p14Val +
				p15Val +
				p16Val +
				p17Val +
				p18Val +
				p19Val +
				p20Val +
				p21Val +
				p22Val +
				p23Val +
				p24Val +
				p25Val +
				p26Val +
				p27Val +
				p28Val +
				p29Val +
				p30Val +
				p31Val +
				p32Val +
				p33Val +
				p34Val +
				p35Val +
				p36Val +
				p37Val +
				p38Val +
				p39Val +
				p40Val +
				p41Val +
				p42Val +
				p43Val +
				p44Val +
				p45Val +
				p46Val +
				p47Val +
				p48Val +
				p49Val +
				p50Val +
				p51Val +
				p52Val +
				p53Val +
				p54Val +
				p55Val +
				p56Val +
				p57Val +
				p58Val +
				p59Val +
				p60Val +
				p61Val +
				p62Val +
				p63Val +
				p64Val +
				p65Val +
				p66Val +
				p67Val +
				p68Val +
				p69Val +
				p70Val +
				p71Val +
				p72Val +
				p73Val +
				p74Val +
				p75Val +
				p76Val +
				p77Val +
				p78Val +
				p79Val +
				p80Val +
				p81Val +
				p82Val +
				p83Val +
				p84Val +
				p85Val +
				p86Val +
				p87Val +
				p88Val;
    }
}
