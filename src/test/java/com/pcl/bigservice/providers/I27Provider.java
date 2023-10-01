package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I27Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> i28Provider;
    @Hard
    private final Provider<Integer> i31Provider;
    @Hard
    private final Provider<Integer> i36Provider;
    @Hard
    private final Provider<Integer> i37Provider;
    @Hard
    private final Provider<Integer> i38Provider;
    @Hard
    private final Provider<Integer> i39Provider;
    @Hard
    private final Provider<Integer> i43Provider;
    @Hard
    private final Provider<Integer> i46Provider;
    @Hard
    private final Provider<Integer> i47Provider;
    @Hard
    private final Provider<Integer> i49Provider;
    @Hard
    private final Provider<Integer> i50Provider;
    @Hard
    private final Provider<Integer> i54Provider;
    @Hard
    private final Provider<Integer> i59Provider;
    @Hard
    private final Provider<Integer> i62Provider;
    @Hard
    private final Provider<Integer> i65Provider;
    @Hard
    private final Provider<Integer> i67Provider;
    @Hard
    private final Provider<Integer> i75Provider;
    @Hard
    private final Provider<Integer> i84Provider;
    @Hard
    private final Provider<Integer> i88Provider;
    @Hard
    private final Provider<Integer> i89Provider;
    @Hard
    private final Provider<Integer> i91Provider;
    @Hard
    private final Provider<Integer> i94Provider;
    @Hard
    private final Provider<Integer> i95Provider;
    @Hard
    private final Provider<Integer> i102Provider;
    @Hard
    private final Provider<Integer> i104Provider;
    @Hard
    private final Provider<Integer> i106Provider;
    @Hard
    private final Provider<Integer> i109Provider;
    @Hard
    private final Provider<Integer> i111Provider;
    @Hard
    private final Provider<Integer> i112Provider;
    @Hard
    private final Provider<Integer> i113Provider;
    @Hard
    private final Provider<Integer> i114Provider;
    @Hard
    private final Provider<Integer> i117Provider;
    @Hard
    private final Provider<Integer> i119Provider;
    @Hard
    private final Provider<Integer> i120Provider;
    @Hard
    private final Provider<Integer> i122Provider;
    @Hard
    private final Provider<Integer> i124Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i127Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i131Provider;
    @Hard
    private final Provider<Integer> i132Provider;
    @Hard
    private final Provider<Integer> i134Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i136Provider;
    @Hard
    private final Provider<Integer> i137Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i196Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b3Provider.get(request);
		
        try {
            Thread.sleep(51);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p2Val = b4Provider.get(request);
		int p3Val = b5Provider.get(request);
		int p4Val = b7Provider.get(request);
		int p5Val = b9Provider.get(request);
		int p6Val = b10Provider.get(request);
		int p7Val = b11Provider.get(request);
		int p8Val = b12Provider.get(request);
		int p9Val = b13Provider.get(request);
		int p10Val = b14Provider.get(request);
		int p11Val = b18Provider.get(request);
		int p12Val = b19Provider.get(request);
		int p13Val = b22Provider.get(request);
		int p14Val = b23Provider.get(request);
		int p15Val = b24Provider.get(request);
		int p16Val = b28Provider.get(request);
		int p17Val = b31Provider.get(request);
		int p18Val = b36Provider.get(request);
		int p19Val = b42Provider.get(request);
		int p20Val = b43Provider.get(request);
		int p21Val = b46Provider.get(request);
		int p22Val = i28Provider.get(request);
		int p23Val = i31Provider.get(request);
		int p24Val = i36Provider.get(request);
		int p25Val = i37Provider.get(request);
		int p26Val = i38Provider.get(request);
		int p27Val = i39Provider.get(request);
		int p28Val = i43Provider.get(request);
		int p29Val = i46Provider.get(request);
		int p30Val = i47Provider.get(request);
		int p31Val = i49Provider.get(request);
		int p32Val = i50Provider.get(request);
		int p33Val = i54Provider.get(request);
		int p34Val = i59Provider.get(request);
		int p35Val = i62Provider.get(request);
		int p36Val = i65Provider.get(request);
		int p37Val = i67Provider.get(request);
		int p38Val = i75Provider.get(request);
		int p39Val = i84Provider.get(request);
		int p40Val = i88Provider.get(request);
		int p41Val = i89Provider.get(request);
		int p42Val = i91Provider.get(request);
		int p43Val = i94Provider.get(request);
		int p44Val = i95Provider.get(request);
		int p45Val = i102Provider.get(request);
		int p46Val = i104Provider.get(request);
		int p47Val = i106Provider.get(request);
		int p48Val = i109Provider.get(request);
		int p49Val = i111Provider.get(request);
		int p50Val = i112Provider.get(request);
		int p51Val = i113Provider.get(request);
		int p52Val = i114Provider.get(request);
		
        try {
            Thread.sleep(60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p53Val = i117Provider.get(request);
		int p54Val = i119Provider.get(request);
		int p55Val = i120Provider.get(request);
		int p56Val = i122Provider.get(request);
		int p57Val = i124Provider.get(request);
		int p58Val = i125Provider.get(request);
		int p59Val = i126Provider.get(request);
		int p60Val = i127Provider.get(request);
		int p61Val = i130Provider.get(request);
		int p62Val = i131Provider.get(request);
		int p63Val = i132Provider.get(request);
		int p64Val = i134Provider.get(request);
		int p65Val = i135Provider.get(request);
		int p66Val = i136Provider.get(request);
		int p67Val = i137Provider.get(request);
		int p68Val = i139Provider.get(request);
		int p69Val = i141Provider.get(request);
		int p70Val = i142Provider.get(request);
		int p71Val = i147Provider.get(request);
		int p72Val = i148Provider.get(request);
		int p73Val = i150Provider.get(request);
		int p74Val = i153Provider.get(request);
		int p75Val = i154Provider.get(request);
		int p76Val = i156Provider.get(request);
		int p77Val = i158Provider.get(request);
		int p78Val = i159Provider.get(request);
		int p79Val = i161Provider.get(request);
		int p80Val = i164Provider.get(request);
		int p81Val = i166Provider.get(request);
		int p82Val = i170Provider.get(request);
		int p83Val = i171Provider.get(request);
		int p84Val = i172Provider.get(request);
		int p85Val = i175Provider.get(request);
		
        try {
            Thread.sleep(69);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p86Val = i176Provider.get(request);
		int p87Val = i177Provider.get(request);
		int p88Val = i178Provider.get(request);
		int p89Val = i179Provider.get(request);
		int p90Val = i180Provider.get(request);
		int p91Val = i184Provider.get(request);
		int p92Val = i187Provider.get(request);
		int p93Val = i188Provider.get(request);
		int p94Val = i189Provider.get(request);
		int p95Val = i191Provider.get(request);
		int p96Val = i195Provider.get(request);
		int p97Val = i196Provider.get(request);

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
				p88Val +
				p89Val +
				p90Val +
				p91Val +
				p92Val +
				p93Val +
				p94Val +
				p95Val +
				p96Val +
				p97Val;
    }
}
